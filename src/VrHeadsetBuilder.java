public interface VrHeadsetBuilder {
    VrHeadsetBuilder setStrap(StrapType strap);
    VrHeadsetBuilder setFaceCover(FacialInterface cover);
    VrHeadsetBuilder setControllers(ControllerType controllers);
    VrHeadsetBuilder addPcLinkCable(boolean hasCable);
    VrHeadsetBuilder enableEyeTracking(boolean hasTracking);
    VrHeadset build();
}