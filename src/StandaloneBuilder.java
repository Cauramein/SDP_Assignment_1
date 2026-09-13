public class StandaloneBuilder implements VrHeadsetBuilder {
    private StrapType strap = StrapType.BASIC_FABRIC;
    private FacialInterface faceCover = FacialInterface.FOAM;
    private ControllerType controllers = ControllerType.STANDARD;
    private boolean hasPcLinkCable = false;
    private boolean hasEyeTracking = false;

    @Override public VrHeadsetBuilder setStrap(StrapType strap) { this.strap = strap; return this; }
    @Override public VrHeadsetBuilder setFaceCover(FacialInterface cover) { this.faceCover = cover; return this; }
    @Override public VrHeadsetBuilder setControllers(ControllerType controllers) { this.controllers = controllers; return this; }
    @Override public VrHeadsetBuilder addPcLinkCable(boolean hasCable) { this.hasPcLinkCable = hasCable; return this; }
    @Override public VrHeadsetBuilder enableEyeTracking(boolean hasTracking) { this.hasEyeTracking = hasTracking; return this; }

    @Override
    public VrHeadset build() {
        if (hasPcLinkCable) {
            System.out.println("Warning: Standalone headsets usually rely on WiFi, not cables.");
        }
        return new VrHeadset(strap, faceCover, controllers, hasPcLinkCable, hasEyeTracking);
    }
}