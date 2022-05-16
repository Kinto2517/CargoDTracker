package sample;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import static com.teamdev.jxbrowser.engine.RenderingMode.*;

        import com.teamdev.jxbrowser.browser.Browser;
        import com.teamdev.jxbrowser.engine.Engine;
        import com.teamdev.jxbrowser.engine.EngineOptions;
        import com.teamdev.jxbrowser.view.swing.BrowserView;
        import java.awt.BorderLayout;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.SwingUtilities;

public class GoogleMaps {

    private static final int MIN_ZOOM = 0;
    private static final int MAX_ZOOM = 21;
    private static final String setMarkerScript =
            "var myLatlng = new google.maps.LatLng(40.766666,29.916668);\n" +
                    "var marker = new google.maps.Marker({\n" +
                    "    position: myLatlng,\n" +
                    "    map: map,\n" +
                    "    title: 'Hello World!'\n" +
                    "});";

    private static int zoomValue = 4;

    public static void main(String[] args) {
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("6P830J66YBCTDZZWP3DV58IUOB376PWXZ6KF5T6SA60SLEE3QGD1J9ZY4HR2FWHDI5RB\n" +
                        "\n").build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();

        SwingUtilities.invokeLater(() -> {
            BrowserView view = BrowserView.newInstance(browser);

            JButton zoomInButton = new JButton("Zoom In");
            zoomInButton.addActionListener(e -> {
                if (zoomValue < MAX_ZOOM) {
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    ++zoomValue + ")"));
                }
            });


            JButton zoomOutButton = new JButton("Zoom Out");
            zoomOutButton.addActionListener(e -> {
                if (zoomValue > MIN_ZOOM) {
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript("map.setZoom(" +
                                    --zoomValue + ")"));
                }
            });

            JButton setMarkerButton = new JButton("Set Marker");
            setMarkerButton.addActionListener(e ->
                    browser.mainFrame().ifPresent(frame ->
                            frame.executeJavaScript(setMarkerScript)));

            JPanel toolBar = new JPanel();
            toolBar.add(zoomInButton);
            toolBar.add(zoomOutButton);
            toolBar.add(setMarkerButton);

            JFrame frame = new JFrame("Google Maps");
            frame.add(toolBar, BorderLayout.SOUTH);
            frame.add(view, BorderLayout.CENTER);
            frame.setSize(800, 500);
            frame.setVisible(true);

            browser.navigation().loadUrl("file:C:\\Users\\User\\IdeaProjects\\CargoDTracker\\src\\sample\\map.html");
        });
    }
}

