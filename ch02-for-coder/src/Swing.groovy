import javax.swing.*
import java.awt.*
import java.awt.event.*

// 框架
frame = new JFrame(
        size: [600, 300],
        layout: new FlowLayout(),
        defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE) //

// 按钮
button = new JButton("click")
positionLabel = new JLabel("label")
msgLabel = new JLabel("")

// 嵌板
frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel

// 事件
button.addActionListener(
        { JOptionPane.showMessageDialog(frame, "You clicked!")} as ActionListener
)

// 显示鼠标指针的位置
displayMouseLocation = { positionLabel.setText("$it.x $it.y") }
// 事件
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

//
handleFocus = [
        focusGained : { msgLabel.setText("Good to see you!")},
        focusLost : { msgLabel.setText("Come back soon!")}
]

button.addFocusListener(handleFocus as FocusListener)
events = ['WindowListener', 'ComponentListener']

handler = { msgLabel.setText "$it" }
for (event in events) {
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}"(handlerImpl)
}

frame.show()



