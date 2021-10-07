package co.micol.dbPrj;

import co.micol.dbPrj.db.DevServicelmpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DevServicelmpl dao = new DevServicelmpl();
    	dao.selectList();
    }
}
