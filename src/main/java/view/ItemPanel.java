package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;

public interface ItemPanel {

    JLabel createQuantityLabel();

    GridBagConstraints createConstraintsForQuantityLabel();

    JLabel createItemNameLabel();

    GridBagConstraints createConstraintsForItemNameLabel();

    JButton createAddButton();

    GridBagConstraints createConstraintsForAddButton();

    JTextField createFieldForAmmount();

    GridBagConstraints createConstraintsForAmmount();

    JButton createSubtractButton();

    GridBagConstraints createConstraintsForSubtractButton();

    JCheckBox createIsCompletedCheckBox();

    GridBagConstraints createConstraintsForIsDeletedCB();

    JButton createDeleteButton();

    GridBagConstraints createConstraintsForDeleteButton();
}
