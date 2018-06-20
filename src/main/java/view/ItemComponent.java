package view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ItemComponent extends JPanel {
    public ItemComponent() {
        setBackground( new Color( 143,145,162 ) );
        GridBagLayout gbItemComponent = new GridBagLayout();
        setLayout( gbItemComponent );


        add(createQuantityLabel(), createConstraintsForQuantityLabel());
        add(createItemNameLabel(), createConstraintsForItemNameLabel());
        add(createAddButton(), createConstraintsForAddButton());
        add(createFieldForAmmount(), createConstraintsForAmmount());
        add(createSubtractButton(), createConstraintsForSubtractButton());
        add(createIsCompletedCheckBox(), createConstraintsForIsCompleted());
        add(createDeleteButton(), createConstraintsForDeleteButton());

    }

    private JLabel createQuantityLabel() {
        JLabel quantityLabel = new JLabel("3");
        quantityLabel.setForeground( new Color( 52,63,62 ) );
        return quantityLabel;
    }

    private GridBagConstraints createConstraintsForQuantityLabel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets( 1,5,1,5 );
        return gbc;
    }

    private JLabel createItemNameLabel() {
        JLabel nameLabel = new JLabel(" Cebollas criollas");
        nameLabel.setForeground( new Color( 52,63,62 ) );
        return nameLabel;
    }

    private GridBagConstraints createConstraintsForItemNameLabel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 16;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets( 1,0,1,5 );
        return gbc;
    }

    private JButton createAddButton() {
        JButton addButton = new JButton("Cancelar");
        addButton.setForeground( new Color( 52,63,62 ) );
        return  addButton;
    }

    private GridBagConstraints createConstraintsForAddButton() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 20;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets( 1,0,1,0 );
        return gbc;
    }

    private JTextField createFieldForAmmount() {
        JTextField ammountField = new JTextField();
        ammountField.setForeground( new Color( 52,63,62 ) );
        return ammountField;
    }

    private GridBagConstraints createConstraintsForAmmount() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 24;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets( 1,5,1,5 );
        return gbc;
    }

    private JButton createSubtractButton() {
        JButton subtractButton = new JButton("Quitar");
        subtractButton.setBackground( new Color( 220,237,255 ) );
        subtractButton.setForeground( new Color( 52,63,62 ) );
        return  subtractButton;
    }

    private GridBagConstraints createConstraintsForSubtractButton() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 25;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets( 1,0,1,0 );
        return gbc;
    }

    private JCheckBox createIsCompletedCheckBox() {
       JCheckBox isCompleted = new JCheckBox( ""  );
       isCompleted.setOpaque( false );
       isCompleted.setSelected( true );
       return isCompleted;
    }

    private GridBagConstraints createConstraintsForIsCompleted() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 28;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets( 1,5,1,5 );
        return gbc;
    }

    private JButton createDeleteButton() {
        JButton delButton = new JButton("X");
        delButton.setForeground( new Color( 52,63,62 ) );
        delButton.setBackground( new Color( 255,255,255 ) );
        delButton.setFocusPainted( false );
        return  delButton;
    }

    private GridBagConstraints createConstraintsForDeleteButton() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 32;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        return gbc;
    }
}
