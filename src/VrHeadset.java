public class VrHeadset {
    private StrapType strap;
    private FacialInterface faceCover;
    private ControllerType controllers;
    private boolean hasPcLinkCable;
    private boolean hasEyeTracking;

    public VrHeadset(StrapType strap, FacialInterface faceCover, ControllerType controllers,
                     boolean hasPcLinkCable, boolean hasEyeTracking) {
        this.strap = strap;
        this.faceCover = faceCover;
        this.controllers = controllers;
        this.hasPcLinkCable = hasPcLinkCable;
        this.hasEyeTracking = hasEyeTracking;
    }

    @Override
    public String toString() {
        return "VrHeadset{strap=" + strap + ", faceCover=" + faceCover +
                ", controllers=" + controllers + ", hasPcLinkCable=" + hasPcLinkCable +
                ", hasEyeTracking=" + hasEyeTracking + '}';
    }
}