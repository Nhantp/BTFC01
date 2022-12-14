package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPanel extends JPanel {
    private JList<ItemColor> listColor;
    private JButton btPha;
    private JPanel plBackground;

    public ColorPanel() {
        initPanel();
        addComps();
        addEvents();
    }

    private void addEvents() {
        btPha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = listColor.getSelectedValue().getColor();
                plBackground.setBackground(color);
            }
        });
    }

    private void addComps() {
        DefaultListModel<ItemColor> colorModel = new DefaultListModel<>();
        colorModel.addElement(new ItemColor(Color.RED, "Red"));
        colorModel.addElement(new ItemColor(Color.GREEN, "Green"));
        colorModel.addElement(new ItemColor(Color.BLUE, "Blue"));
        colorModel.addElement(new ItemColor(Color.MAGENTA, "Magenta"));
        colorModel.addElement(new ItemColor(Color.YELLOW, "Yellow"));
        colorModel.addElement(new ItemColor(Color.BLACK, "Black"));
        colorModel.addElement(new ItemColor(Color.ORANGE, "Orange"));
        colorModel.addElement(new ItemColor(Color.LIGHT_GRAY, "Light Gray"));
        colorModel.addElement(new ItemColor(Color.DARK_GRAY, "Dark Gray"));
        colorModel.addElement(new ItemColor(Color.CYAN, "Cyan"));
        colorModel.addElement(new ItemColor(Color.GRAY, "Gray"));
        listColor = new JList<>();
        listColor.setVisibleRowCount(5);
        listColor.setModel(colorModel);
        listColor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listColor.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        btPha = new JButton("Tinting");
        btPha.setBounds(220, 70, 100, 70);
        plBackground = new JPanel();
        plBackground.setBackground(Color.GREEN);
        plBackground.setBounds(340, 0, 160, 200);
        JScrollPane scrollPane = new JScrollPane(listColor);
        scrollPane.setBounds(0, 0, 200, 200);
        add(scrollPane);
        add(btPha);
        add(plBackground);
    }

    private void initPanel() {
        setBackground(Color.WHITE);
        setLayout(null);
    }
}
