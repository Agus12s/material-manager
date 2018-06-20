package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    public MainView() {
        final JPanel panel = createMainContainer();
        add(panel);
    }

    /**
     * Creates the main container. Holds all the other containers

     */
    private JPanel createMainContainer() {
        final JPanel elementsContainer = new JPanel();
        elementsContainer.setSize(500, 400);
        setSize(elementsContainer.getSize());
        elementsContainer.setBackground(new Color(220, 237, 255));
        elementsContainer.setLayout(new GridBagLayout());

        elementsContainer.add(createHeader(), createHeaderConstraints());
        elementsContainer.add(createItemContainer(), createItemContainerConstraints());
        elementsContainer.add(createAddButton() , createAddButtonConstraints());

        return elementsContainer;
    }

    /**
     * Simply creates the header. Title of the window.
     *
     * @return the component for the main panel.
     */
    private JLabel createHeader() {
        JLabel titleLabel = new JLabel("ADMINISTRADOR DE MATERIALES E INGREDIENTES");
        titleLabel.setBackground(new Color(255, 240, 240));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setForeground(new Color(52, 63, 62));
        titleLabel.setBorder(BorderFactory.createTitledBorder(""));
        return titleLabel;
    }

    private GridBagConstraints createHeaderConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 20;
        gbc.gridheight = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.insets = new Insets(5, 5, 5, 5);
        return gbc;
    }

    /**
     * Creates the container for all the items added to the list.
     *
     * @return the container, with it's main LM config.
     */
    private JPanel createItemContainer() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        final JPanel itemsContainer = new JPanel(gridBagLayout);
        itemsContainer.setBorder(BorderFactory.createTitledBorder(""));
        itemsContainer.setBackground(new Color(52, 63, 62));
        return itemsContainer;
    }

    private GridBagConstraints createItemContainerConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 20;
        gbc.gridheight = 15;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        return gbc;
    }

    private GridBagConstraints createItemConstrainsts() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.insets = new Insets(2, 0, 2, 0);
        return gbc;
    }

    private JButton createAddButton() {
        JButton addButton = new JButton("Agregar");

        addButton.setBackground(new Color(148, 176, 218));
        addButton.setForeground(new Color(52, 63, 62));

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new NewItemView().setVisible(true);
            }
        });
        return addButton;
    }

    private GridBagConstraints createAddButtonConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 18;
        gbc.gridwidth = 20;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(5, 5, 5, 5);
        return gbc;
    }
}
