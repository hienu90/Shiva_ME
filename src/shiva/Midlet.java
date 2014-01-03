/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shiva;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import com.sun.lwuit.util.UIBuilder;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Hashtable;
import javax.microedition.midlet.*;

/**
 * @author hien
 */
public class Midlet extends MIDlet {
    private Resources res;

    public void startApp() {
        Display.init(this);
        try {
            res=Resources.open("/ui/ME_UI.res");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        setShivaTheme(res, "THEME_ChaoMung");
        setShivaForm(res, "GUI_ChaoMung");

        setShivaTheme(res, "THEME_GiaCaPhe");
        setShivaForm(res, "GUI_GiaCaPhe"); 
        
        
    }
    private void setShivaTheme(Resources res,String themeName)
    {
        Hashtable hashTheme=res.getTheme(themeName);
        UIManager.getInstance().setThemeProps(hashTheme);
    }
    private void setShivaForm(Resources res,String guiName)
    {
        UIBuilder builder = new UIBuilder();
        Form frm = (Form)builder.createContainer(res,guiName);
        frm.show();
    }
    public void pauseApp() {
        
    }
    
    public void destroyApp(boolean unconditional) {
        
    }
}
