import java.util.*;
public class BuilderPattern {
    public static void main(String[] args) {  
        SoftwareDeveloper sde=new SoftwareDeveloper();
        FaceBook fb=new FaceBook();
        sde.makeApp(fb);
        App app=fb.getApp();
        app.show();
    }
}
class SoftwareDeveloper{
private SocialMedia meta=null;
public void makeApp(SocialMedia meta){
    this.meta=meta;
    meta.publishPhotoAndVideo();
    meta.chatWithFriends();
    meta.makeVideoCall();
}
}
interface SocialMedia{
    public void publishPhotoAndVideo();
    public void makeVideoCall();
    public void chatWithFriends();
    public App getApp();
}
class FaceBook implements SocialMedia{
    private App app;
    public FaceBook(){
        app=new App();
        app.addFeatures("FaceBook-->");
    }
    public void publishPhotoAndVideo(){
        app.addFeatures("This app supports publishing photos and videos");
    }
    public void makeVideoCall(){
        app.addFeatures("This app supports video call");
    }
    public void chatWithFriends(){
        app.addFeatures("This supports chat");
    }
    public App getApp(){
        return app;
    }
}
class Instagram implements SocialMedia{
    private App app;
    public Instagram(){
        app=new App();
        app.addFeatures("Instagram-->");
    }
    public void publishPhotoAndVideo(){
        app.addFeatures("This app supports publishing photos and videos");
    }
    public void makeVideoCall(){
        app.addFeatures("This app supports video call");
    }
    public void chatWithFriends(){
        app.addFeatures("This supports chat");
    }
    public App getApp(){
        return app;
    }
}
class App{
    private List<String> product;
    App(){
        product=new ArrayList<>();
    }
    public void addFeatures(String feature){
        product.add(feature);
    }
    public void show(){
        for(String it : product)
        System.out.println(it);
    }
}