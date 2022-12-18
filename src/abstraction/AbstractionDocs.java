package abstraction;

public class AbstractionDocs {
	/*
	 * ========================= Abstraction ===============================
	 *  # process of hiding implementation details in the
	 *    program is known as abstraction.
	 *    
	 *  # To achieve abstraction :
	 *     
	 *     a> Abstract class :
	 *     	 # class which contains abstract methods(unimplemented methods) and 
	 *         non-abstract methods(implemented methods) is called abstraction.
	 *         
	 *            # abstract method :
	 *               -> method which does not have implementation details or body.
	 *               e.g.
	 *                abstract void print();
	 *                
	 *         # every abstract class must have at least one child class and
	 *           child class must override abstract methods.
	 *           
	 *         # we can't create object of abstract class.
	 *         
	 *         syntax :
	 *         
	 *          abstract class class_name{
	 *          
	 *               //abstract methods
	 *               e.g.
	 *                 abstract void sum();
	 *               
	 *               //non-abstract methods
	 *                 void print(){
	 *                     
	 *                 }
	 *          }
	 *     
	 *     b> Interface :
	 *     
	 *     # same as class which contains public abstract method and
	 *       public static final variables only.
	 *       
	 *    # every interface must have at least one implementation class
	 *      and impl. class must override abstract methods.
	 *      
	 *   # we can't create object of interface.
	 *   # its 100% abstraction.
	 *   
	 *   syntax :
	 *   
	 *      interface   interface_name{
	 *      
	 *                //public static final variables
	 *                
	 *                //public abstract methods
	 *      }
	 */

}
