public class ClassLoaderExample {
    public static void main(String[] args){
        System.out.println("Bootstrap ClassLoader:"+String.class.getClassLoader());
        System.out.println("Extension ClassLoader:"+
        ClassLoaderExample.class.getClassLoader().getParent());
        System.out.println("Application ClassLoader:"+
        ClassLoaderExample.class.getClassLoader());
    }
}
