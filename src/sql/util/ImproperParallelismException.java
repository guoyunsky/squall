
package sql.util;

/*
 * Occurs when an optimizer tries to assign parallelism (which is obtained by the formula)
 *   more than how many distinct join condition key values are there.
 */
public class ImproperParallelismException extends RuntimeException {
    private String _msg;
    
    public ImproperParallelismException(String msg){
        _msg = msg;
    }
    
    @Override
    public String getMessage(){
        return _msg;
    }
}