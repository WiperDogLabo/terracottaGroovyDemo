This directory contains the terracotta sample written in groovy language.  
You need to have groovy executable environment to use this source code.  
(version 2.0 or later)

1. build terracotta source
https://github.com/TerracottaUnofficialRepositories/ehcache.git
https://github.com/TerracottaUnofficialRepositories/quartz.git
https://github.com/TerracottaUnofficialRepositories/terracotta-runtime.git
2. under the directory terracotta-runtime/deploy, run terracotta-server by doing:
mvn mvn exec:ec -P start-server

3. start this demo 
groovy TerracottaConnect.groovy

