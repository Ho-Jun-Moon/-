package com.test;


public class Task extends SwingWorker<Void, Void> {
    public Void doInBackground() { // executed in worker thread
        Random random = new Random();
        int progress = 0;
        setProgress(0); // Initialize progress property.
        while (progress < 100) {
            // Sleep for up to one second.
            try {
            Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) { }
            // Make random progress
            progress += random.nextInt(10);
            setProgress(Math.min(progress, 100));
        }
        return null;
    }
public void done() { // executed in Event Dispatch Thread
Toolkit.getDefaultToolkit().beep();
startButton.setEnabled(true);
setCursor(null); // turn off the wait cursor
taskOutput.append("Done!\n");
}
}
