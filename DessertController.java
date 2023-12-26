//Filename: DessertController.java
//Author: Keidy Lopez
//Description:

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DessertController implements ListSelectionListener {
    private Desserts dessertList;

    //when user clicks on an item of the list, get the name of the selection, find it in the array of recipes,
    // and the return the recipe corresponding to that recipe title, and display it in the add recipe window
    public DessertController(){

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {


    }
}
