/**
 * @author Edward Tupacz
 * interface with interactions decided by child classes
 */
public interface State {
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
    
}
