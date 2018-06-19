package view;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ItemComponent extends JPanel {
    public ItemComponent() {


        add(createQuantityLabel(), createConstraintsForQuantityLabel());
        add(createItemNameLabel(), createConstraintsForItemNameLabel());
        add(createAddButton(), createConstraintsForAddButton());
        add(createFieldForAmmount(), createConstraintsForAmmount());
        add(createDeleteButton(), createConstraintsForDeleteButton());

    }

    private JLabel createQuantityLabel() {
        return null;
    }

    private GridBagConstraints createConstraintsForQuantityLabel() {
        return null;
    }

    private JLabel createItemNameLabel() {
        return null;
    }

    private GridBagConstraints createConstraintsForItemNameLabel() {
        return null;
    }

    private JButton createAddButton() {
        return null;
    }

    private GridBagConstraints createConstraintsForAddButton() {
        return null;
    }

    private JTextField createFieldForAmmount() {
        return null;
    }

    private GridBagConstraints createConstraintsForAmmount() {
        return null;
    }

    private JButton createSubtractButton() {
        return null;
    }

    private GridBagConstraints createConstraintsForSubtractButton() {
        return null;
    }

    private JCheckBox createIsCompletedCheckBox() {
        return null;
    }

    private GridBagConstraints createConstraintsForIsDeletedCB() {
        return null;
    }

    private JButton createDeleteButton() {
        return null;
    }

    private GridBagConstraints createConstraintsForDeleteButton() {
        return null;
    }
}
