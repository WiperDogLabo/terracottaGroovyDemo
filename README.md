TerraCottaに関して色々な調査していますが、最新結果は以下のものがあります(調査時点で順番します)：      
1. terracottaGroovyPrj:　  
1.* GroovyProjectでTerracottaを使って、Jobを作成して、実行できたものです。    
1.* EclipseにImportして、GroovyScriptでファイルをBuiltするのはいいです。      

2. demoTerracottaBundle & demoTerracottaOSGI：      
2.* demoTerracottaBundleはMaven Projectです。処理内容としてはこのProjectがterracottaGroovyPrjとちょっと同じですが、Maven　Bundle形でBuiltされます。      
2.* demoTerracottaOSGI：OSGI環境で、terracottaWithGroovy　Bundleを使うものです。      

3. terracottaWithWiperdog：      
3.* Wiperdog＋Terracottaを使うためのsetup scriptと必要なものです。  
    
4. terracottaWithWiperdogMultiProcess      
4.* ForkをTerracottaと実行できるための変更したものです      

5. terracotta_lib_and_server:       
5.* 以下のものをやるScriptがあります：      
5.* SVNからTerraCotta Opensourceを取得する。（まだCheckoutしていない場合）      
5.* terracotta-4.1.1-build.patchとQuartz/pom.xmlファイルを使って、ソースを更新する。      
5.* Mavenコマンドで、Ehcache、Quartz、terracottaという３つものをBuiltする。      
5.* TerraCottaサーバを起動する。      