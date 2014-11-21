/* Licensed under LGPL v. 2.1 or any later version;
 see GNU LGPL for details.
 Original Author: Frank Hardisty */

package geovista.common.event;

import java.util.EventListener;

/**
 * This interface enables listening to senders of SelectionEvents.
 * 
 * This interface also enables "fireSelectionChanged" methods in classes that
 * generate and broadcast SelectionEvents.
 * 
 */
public interface SelectionListener extends EventListener {

    public void selectionChanged(SelectionEvent e);

    // public SelectionEvent getSelectionEvent();

}