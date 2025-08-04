import javax.swing.*;

public class Attendance {

    public Attendance() {
        JFrame presentFrame = new JFrame("Absent present");
        presentFrame.setSize(400, 300);
        presentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        presentFrame.setLayout(null);

        JLabel attendance = new JLabel("Did you attend the class?");
        attendance.setBounds(100, 50, 300, 25);
        presentFrame.add(attendance);

        JRadioButton presentBtn = new JRadioButton("present");
        presentBtn.setBounds(100,100,80,25);
        presentFrame.add(presentBtn);

        JRadioButton absentBtn = new JRadioButton("absent");
        absentBtn.setBounds(200,100,80,25);
        presentFrame.add(absentBtn);

        ButtonGroup attendGroup= new ButtonGroup();
        attendGroup.add(presentBtn);
        attendGroup.add(absentBtn);

        JButton done= new JButton("done");
        done.setBounds(150,200,80,25);
        presentFrame.add(done);

        done.addActionListener(e -> {
            presentFrame.dispose();

            new Info();
        });
        presentFrame.setVisible(true);
    }
}
