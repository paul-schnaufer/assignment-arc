package configuration;

/**
 * TODO: Implement the configuration for the simulator.
 * This class should include settings such as:
 * - Memory size (30 is the default)
 * - If zero values should be shown (default is false);
 */
public class SimulatorConfiguration {
    private int memorySize;
    private boolean showZeroValues;

    public SimulatorConfiguration() {
        this.memorySize = 30; // Default memory size
        this.showZeroValues = false; // Default to not showing zero values
    }
}
