/*
 * Woman character 
 */
package family;

/**
 *
 * @author Bogdan
 */
public class Woman extends Thread{
    private Boolean isSleeping = true;
    private Cigar tigara;
    
    public Boolean getIsSleeping() {
        return isSleeping;
    }

    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
        
    }
    
   public Woman(Cigar c){
       tigara = c;
   }
    
    @Override
    public void run(){
        System.out.println("Woman is sleeping ..and snoring");
        while(isSleeping){
            return;
    }
         System.out.println("Woman is looking at TV");
    }
   
}

