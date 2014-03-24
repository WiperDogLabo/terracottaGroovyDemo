TerraCottaに関して色々な調査していますが、最新結果は以下のものがあります(調査時点で順番します)：      
1.   terracottaGroovyPrj:　  
- GroovyProjectでTerracottaを使って、Jobを作成して、実行できたものです。    
- EclipseにImportして、GroovyScriptでファイルをBuiltするのはいいです。      

2.   demoTerracottaBundle & demoTerracottaOSGI：      
- demoTerracottaBundleはMaven Projectです。処理内容としてはこのProjectがterracottaGroovyPrjとちょっと同じですが、Maven　Bundle形でBuiltされます。      
- demoTerracottaOSGI：OSGI環境で、terracottaWithGroovy　Bundleを使うものです。      

3.   terracottaWithWiperdog：      
- Wiperdog＋Terracottaを使うためのsetup scriptと必要なものです。    
4.   terracottaWithWiperdogMultiProcess      
- ForkをTerracottaと実行できるための変更したものです      
5.   terracotta_lib_and_server:       
- 以下のものをやるScriptがあります：      
- SVNからTerraCotta Opensourceを取得する。（まだCheckoutしていない場合）      
- terracotta-4.1.1-build.patchとQuartz/pom.xmlファイルを使って、ソースを更新する。      
- Mavenコマンドで、Ehcache、Quartz、terracottaという３つものをBuiltする。      
- TerraCottaサーバを起動する。      