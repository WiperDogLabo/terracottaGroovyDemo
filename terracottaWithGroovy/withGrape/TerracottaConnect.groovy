
@Grab(group='org.quartz-scheduler', module='quartz', version='2.2.1')
@Grab(group='org.terracotta.toolkit', module='terracotta-toolkit-api', version='2.1.0')
@Grab(group='org.terracotta.toolkit', module='terracotta-toolkit-api-internal', version='2.1.0')

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.SimpleScheduleBuilder;

class TerracottaConnect {
	public static void main(String [] args) {
		def con = new TerracottaConnect()
	}


	public TerracottaConnect(){
		println "Test terracotta 4.1.1"
		def sf = new StdSchedulerFactory()
		def schedProp = new Properties()
		schedProp.setProperty("org.quartz.scheduler.instanceName", "TestScheduler")
		schedProp.setProperty("org.quartz.scheduler.instanceId", "groovy_instance")
		schedProp.setProperty("org.quartz.scheduler.skipUpdateCheck", "true")
		schedProp.setProperty("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool")
		schedProp.setProperty("org.quartz.threadPool.threadCount", "1")
		schedProp.setProperty("org.quartz.threadPool.threadPriority", "5")
		schedProp.setProperty("org.quartz.jobStore.misfireThreshold", "60000")
		schedProp.setProperty("org.quartz.jobStore.class", "org.terracotta.quartz.TerracottaJobStore")
		schedProp.setProperty("org.quartz.jobStore.tcConfigUrl", "localhost:9510")
//		 schedProp.setProperty("org.quartz.scheduler.classLoadHelper.class", "org.quartz.simpl.ThreadContextClassLoadHelper")
//		 schedProp.setProperty("org.quartz.scheduler.classLoadHelper.class", "org.quartz.simpl.InitThreadContextClassLoadHelper")
//		schedProp.setProperty("org.quartz.scheduler.classLoadHelper.class", "org.quartz.simpl.LoadingLoaderClassLoadHelper")
		try {
			sf.initialize(schedProp)
			Scheduler sched = sf.getScheduler()
			
			JobDetail job = JobBuilder.newJob(AJob.class).withIdentity("job1").storeDurably(true).build()
			sched.addJob(job, true);
			def trigger = TriggerBuilder.newTrigger().forJob(job).startNow().withSchedule(new SimpleScheduleBuilder().repeatForever().withIntervalInSeconds(10)).build();
			sched.scheduleJob(trigger)
			
			sched.start()
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace()
		}
	}
}


