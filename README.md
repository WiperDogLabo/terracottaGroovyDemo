TerraCottaに関して色々な調査していますが、最新結果は以下のものがあります(調査時点で順番します)：      
============     
    
<br/>1. terracottaGroovyPrj:　  
<br/><br/>	GroovyProjectでTerracottaを使って、Jobを作成して、実行できたものです。    
<br/><br/>	EclipseにImportして、GroovyScriptでファイルをBuiltするのはいいです。      
<br/>2. demoTerracottaBundle & demoTerracottaOSGI：      
<br/><br/>	demoTerracottaBundleはMaven Projectです。処理内容としてはこのProjectがterracottaGroovyPrjとちょっと同じですが、Maven　Bundle形でBuiltされます。      
<br/><br/>	demoTerracottaOSGI：OSGI環境で、terracottaWithGroovy　Bundleを使うものです。      
<br/>3. terracottaWithWiperdog：      
<br/><br/>	Wiperdog＋Terracottaを使うためのsetup scriptと必要なものです。      
<br/>4. terracottaWithWiperdogMultiProcess      
<br/><br/>	ForkをTerracottaと実行できるための変更したものです      
<br/>5. terracotta_lib_and_server:       
<br/><br/>	以下のものをやるScriptがあります：      
<br/><br/>		SVNからTerraCotta Opensourceを取得する。（まだCheckoutしていない場合）      
<br/><br/>		terracotta-4.1.1-build.patchとQuartz/pom.xmlファイルを使って、ソースを更新する。      
<br/><br/>		Mavenコマンドで、Ehcache、Quartz、terracottaという３つものをBuiltする。      
<br/><br/>		TerraCottaサーバを起動する。      