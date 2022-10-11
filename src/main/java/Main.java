public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }

    public int error(int i){
        return i;
    }
    
    public void error2(){
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }
    
      public void error3(){
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }
          public void error4(){
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }
}
