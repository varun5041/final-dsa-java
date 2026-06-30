package Collections.Map.WeakHAshmap;

import java.util.WeakHashMap;

public class WeakHASHMAPS {
    static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();

        imageCache.put(new String("Image2"),new Image("Varun"));
        imageCache.put(new String("image1"),new Image("Apple"));
                        //weak referenced Keys
        System.out.println(imageCache);
        System.gc();
        DoingSomeWork();
       System.out.println(imageCache);

    }

    public static void DoingSomeWork(){
        System.out.println("DOING WORK");
        try{
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("thankYou");
        }
    }


}

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
