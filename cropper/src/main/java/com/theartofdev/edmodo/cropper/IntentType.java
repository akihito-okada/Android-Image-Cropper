package com.theartofdev.edmodo.cropper;

public enum IntentType {
    PickImage, TakePicture, OpenGallery;

    public static IntentType fromOrdinal(int ordinal) {
        for (IntentType intentType : IntentType.values()) {
            if (intentType.ordinal() == ordinal) {
                return intentType;
            }
        }
        return PickImage;
    }
}
