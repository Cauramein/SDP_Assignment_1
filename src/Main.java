import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VrDirector director = new VrDirector();
        System.out.println("VR Headset Store & Configurator");
        System.out.println("1.Custom Build (Interactive Inputs)");
        System.out.println("2.Auto-Buy Preset Bundle (Director)");
        System.out.print("Select mode (1 or 2): ");
        int mode = scanner.nextInt();
        if (mode == 1)
        {
            System.out.println("\nInitializing Standalone Builder...");
            VrHeadsetBuilder builder = new StandaloneBuilder();
            System.out.print("Upgrade to Elite Battery Strap? (true/false): ");
            if (scanner.nextBoolean())
            {
                builder.setStrap(StrapType.ELITE_BATTERY_STRAP);
            }
            VrHeadset customRig = builder.addPcLinkCable(false).build();
            System.out.println("\nSuccessfully built your custom rig: " + customRig);
        }
        else if (mode == 2)
        {
            System.out.println("\nAvailable Pre-built Bundles:");
            System.out.println("1. Media Viewer Bundle");
            System.out.println("2. Steam VR Pro Rig");
            System.out.println("3. Developer Test Kit");
            System.out.print("Select preset to auto-buy (1-3): ");
            int presetChoice = scanner.nextInt();
            VrHeadset autoBoughtRig;
            if (presetChoice == 1)
            {
                autoBoughtRig = director.constructMediaViewer(new StandaloneBuilder());
            }
            else if (presetChoice == 2)
            {
                autoBoughtRig = director.constructSteamVrRig(new PcVrBuilder());
            } else
            {
                autoBoughtRig = director.constructDeveloperTestRig(new StandaloneBuilder());
            }
            System.out.println("\nOrder confirmed! Auto-bought preset rig:");
            System.out.println(autoBoughtRig);
        }
        else
        {
            System.out.println("Invalid selection.");
        }
        scanner.close();
    }
}