/*
 * Purpose : list with icon and text
*/
package Data;

import javax.swing.ImageIcon;

public class IconList {
    private String value;
    private ImageIcon icon;
    
    public IconList(String value, ImageIcon icon) {
        this.value = value;
        this.icon = icon;
    }
    
    public String getValue() {
        return value;
    }
    
    public ImageIcon getIcon() {
        return icon;
    }
    
    public String toString() {
        return value;
    }
}
