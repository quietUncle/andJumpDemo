# andJumpDemo
AndJump的demo,支持activity与fragment直接传值



使用方法:
    全局gradle: 
    
    classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'  (修改成当前apt版本)
    
    项目gradle:  
     
         compile 'com.qt:andjump-api:0.2'
         apt  'com.qt:andjump-compiler:0.2'
         
      
      项目中引用：
        
           如果要自动生成可跳转的Activity，直接在类上使用 ：@QtInject
           
           例如: 
            
            @QtInject
            MainActivity extend Activity{
            }
            
            在使用处:
            
            QtMainActivity.getInstance().start(context);
            
            如果需要带参数跳转，在相应的参数前加上@QtInject
            
           
            例如:
            
             
            MainActivity extend Activity{
                @QtInject 
                
                String name;
                
                void onCreat(Bundle savedInstanceState){
                  QtMainActivity.inject(this);
                  Log.e("tag",name);
                }
            }
            
            在使用处:
            
            QtMainActivity.getInstance().setName("安静大叔").start(context);
            
            
           当然，因为代码是使用apt自动生成的，所以在加完@Inject 之后，要先rebuild才会生成QtMainActivity
           
           这个类名的规则是以Qt+类名
           
           
           更多使用方法请参照Demo
           
         


