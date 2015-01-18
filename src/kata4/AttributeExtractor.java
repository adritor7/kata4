/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author aitor
 */
public interface AttributeExtractor<Entity,Attribute>  {
   
    public Attribute extract(Entity entity);
    
}
