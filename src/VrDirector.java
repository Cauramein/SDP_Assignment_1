public class VrDirector {
    public VrHeadset constructMediaViewer(VrHeadsetBuilder builder) {
        return builder.setStrap(StrapType.ELITE_BATTERY_STRAP)
                .setFaceCover(FacialInterface.SILICONE)
                .setControllers(ControllerType.STANDARD)
                .addPcLinkCable(false)
                .enableEyeTracking(false)
                .build();
    }

    public VrHeadset constructSteamVrRig(VrHeadsetBuilder builder) {
        return builder.setStrap(StrapType.ELITE_BATTERY_STRAP)
                .setFaceCover(FacialInterface.VENTILATED)
                .setControllers(ControllerType.PRO_TRACKING)
                .addPcLinkCable(true)
                .enableEyeTracking(true)
                .build();
    }
}