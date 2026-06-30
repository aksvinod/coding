public class Example{
        static {
            System.out.println("Class Example is loaded!");
        }
    }
    
    public class LoadingExample{
        public static void main(String[] args) throws ClassNotFoundException{
            Class.forName("Example");
        }
    }
