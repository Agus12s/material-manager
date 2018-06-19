package view;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ItemPanelImpl extends JPanel implements ItemPanel {
    public ItemPanelImpl() {


        add(createQuantityLabel(), createConstraintsForQuantityLabel());
        add(createItemNameLabel(), createConstraintsForItemNameLabel());
        add(createAddButton(), createConstraintsForAddButton());
        add(createFieldForAmmount(), createConstraintsForAmmount());
        add(createDeleteButton(), createConstraintsForDeleteButton());

    }

    @Override
    public JLabel createQuantityLabel() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForQuantityLabel() {
        return null;
    }

    @Override
    public JLabel createItemNameLabel() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForItemNameLabel() {
        return null;
    }

    @Override
    public JButton createAddButton() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForAddButton() {
        return null;
    }

    @Override
    public JTextField createFieldForAmmount() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForAmmount() {
        return null;
    }

    @Override
    public JButton createSubtractButton() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForSubtractButton() {
        return null;
    }

    @Override
    public JCheckBox createIsCompletedCheckBox() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForIsDeletedCB() {
        return null;
    }

    @Override
    public JButton createDeleteButton() {
        return null;
    }

    @Override
    public GridBagConstraints createConstraintsForDeleteButton() {
        return null;
    }
}
