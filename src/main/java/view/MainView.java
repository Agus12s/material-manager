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

public class MainView extends JFrame {
    public MainView() {
        JPanel panel = createMainContainer();
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
        GridBagLayout gbAllContentContainer = new GridBagLayout();
        GridBagConstraints gbcAllContentContainer = new GridBagConstraints();
        elementsContainer.setLayout(gbAllContentContainer);

        JLabel header = createHeader(gbAllContentContainer);
        elementsContainer.add(header);

        JPanel itemsContainer = createItemContainer(gbAllContentContainer);
        elementsContainer.add(itemsContainer);

        JButton addButton = createAddButton(gbAllContentContainer);
        elementsContainer.add(addButton);

        return elementsContainer;
    }

    /**
     * Simply creates the header. Title of the window.
     * @param gridBagLayout Layout to set constraints from within the method.
     * @return the component for the main panel.
     */
    private JLabel createHeader(GridBagLayout gridBagLayout) {
        JLabel titleLabel = new JLabel("ADMINISTRADOR DE MATERIALES E INGREDIENTES");
        titleLabel.setBackground(new Color(255, 240, 240));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setForeground(new Color(52, 63, 62));
        titleLabel.setBorder(BorderFactory.createTitledBorder(""));
        GridBagConstraints gbcTitle = new GridBagConstraints();
        gbcTitle.gridx = 0;
        gbcTitle.gridy = 0;
        gbcTitle.gridwidth = 20;
        gbcTitle.gridheight = 3;
        gbcTitle.fill = GridBagConstraints.BOTH;
        gbcTitle.weightx = 0;
        gbcTitle.weighty = 0;
        gbcTitle.anchor = GridBagConstraints.PAGE_START;
        gbcTitle.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(titleLabel, gbcTitle);
        return titleLabel;
    }

    /**
     * Creates the container for all the items added to the list.
     *
     * @return the container, with it's main LM config.
     */
    private JPanel createItemContainer(GridBagLayout gridBagLayout) {
        final JPanel itemsContainer = new JPanel();
        GridBagLayout gbcItemsContainer = new GridBagLayout();
        GridBagConstraints gbcItemList = new GridBagConstraints();
        GridBagLayout gbItemListContainer = new GridBagLayout();
        GridBagConstraints gbcItemListContainer = new GridBagConstraints();
        itemsContainer.setLayout(gbItemListContainer);
        itemsContainer.setBorder(BorderFactory.createTitledBorder(""));
        gbcItemList.gridx = 0;
        gbcItemList.gridy = 3;
        gbcItemList.gridwidth = 20;
        gbcItemList.gridheight = 15;
        gbcItemList.fill = GridBagConstraints.BOTH;
        gbcItemList.weightx = 1;
        gbcItemList.weighty = 1;
        gbcItemList.anchor = GridBagConstraints.NORTH;
        gbcItemList.anchor = GridBagConstraints.CENTER;
        itemsContainer.setLayout(gbcItemsContainer);
        gridBagLayout.setConstraints(itemsContainer, gbcItemList);
        return itemsContainer;
    }

    private JButton createAddButton(GridBagLayout gridBagLayout) {
        JButton addButton = new JButton("Agregar");

        addButton.setBackground(new Color(148, 176, 218));
        addButton.setForeground(new Color(52, 63, 62));

        GridBagConstraints gbcAddButton = new GridBagConstraints();
        gbcAddButton.gridx = 0;
        gbcAddButton.gridy = 18;
        gbcAddButton.gridwidth = 20;
        gbcAddButton.gridheight = 2;
        gbcAddButton.fill = GridBagConstraints.BOTH;
        gbcAddButton.weightx = 1;
        gbcAddButton.weighty = 0;
        gbcAddButton.anchor = GridBagConstraints.PAGE_END;
        gbcAddButton.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(addButton, gbcAddButton);
//        CODIGO PREPARADO PARA SIGUIENTE ISSUE.
//        addButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                new NewIngredientView().setVisible(true);
//            }
//        });
        return addButton;
    }
}
