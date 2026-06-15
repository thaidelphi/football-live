package com.applovin.mediation;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface MaxMediatedNetworkInfo {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f9853a;

        InitializationStatus(int i10) {
            this.f9853a = i10;
        }

        public static InitializationStatus fromCode(int i10) {
            InitializationStatus[] values;
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == i10) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }

        public int getCode() {
            return this.f9853a;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
