package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewItemView extends JFrame {
    public NewItemView() {
        add(createContent());
    }

    private JPanel createContent() {
        final JPanel content = new JPanel(new GridBagLayout());
        content.setBorder(BorderFactory.createTitledBorder("Agregar Item"));
        content.setSize(300, 150);
        setSize(content.getSize());
        content.add(createNameLabel(), createNameLabelConstraints());
        content.add(createNameField(), createNameFieldConstraints());
        content.add(createQuantityLabel(), createQuantityLabelConstraints());
        content.add(createQuantityLabelField(), createQantityLabelConstraintsField());
        content.add(createAddButton(), createAddButtonConstraints());
        content.add(createRemoveButton(), createRemoveButtonConstraints());
        return content;
    }

    private JLabel createNameLabel() {
        JLabel nameLabel = new JLabel("Material");
        return nameLabel;
    }

    private GridBagConstraints createNameLabelConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        return gbc;

    }

    private JTextField createNameField() {
        JTextField nameField = new JTextField();
        return nameField;

    }

    private GridBagConstraints createNameFieldConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.gridwidth = 13;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 4, 0, 0);
        return gbc;

    }

    private JLabel createQuantityLabel() {
        JLabel quantityLabel = new JLabel("Cantidad");
        return quantityLabel;
    }

    private GridBagConstraints createQuantityLabelConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTH;
        return gbc;
    }

    private JTextField createQuantityLabelField() {
        JTextField quantityLabelField = new JTextField();
        return quantityLabelField;
    }

    private GridBagConstraints createQantityLabelConstraintsField() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.gridwidth = 13;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 4, 0, 0);
        return gbc;
    }

    private JButton createAddButton() {
        JButton addButton = new JButton("Agregar");
        return  addButton;
    }

    private GridBagConstraints createAddButtonConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 11;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 0, 0, 0);
        return gbc;
    }

    private JButton createRemoveButton() {
        JButton removeButton = new JButton("Cancelar");
        return  removeButton;
    }

    private GridBagConstraints createRemoveButtonConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 2;
        gbc.gridwidth = 9;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 0, 0, 0);
        return gbc;
    }
}


