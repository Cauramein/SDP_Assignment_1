public class PcVrBuilder implements VrHeadsetBuilder {
    private StrapType strap;
    private FacialInterface faceCover;
    private ControllerType controllers;
    private boolean hasPcLinkCable;
    private boolean hasEyeTracking;

    @Override public VrHeadsetBuilder setStrap(StrapType strap) { this.strap = strap; return this; }
    @Override public VrHeadsetBuilder setFaceCover(FacialInterface cover) { this.faceCover = cover; return this; }
    @Override public VrHeadsetBuilder setControllers(ControllerType controllers) { this.controllers = controllers; return this; }
    @Override public VrHeadsetBuilder addPcLinkCable(boolean hasCable) { this.hasPcLinkCable = hasCable; return this; }
    @Override public VrHeadsetBuilder enableEyeTracking(boolean hasTracking) { this.hasEyeTracking = hasTracking; return this; }

    @Override
    public VrHeadset build() {
        if (!hasPcLinkCable) {
            throw new IllegalStateException("PC VR setups require a link cable to connect to the computer!");
        }
        return new VrHeadset(strap, faceCover, controllers, hasPcLinkCable, hasEyeTracking);
    }
}