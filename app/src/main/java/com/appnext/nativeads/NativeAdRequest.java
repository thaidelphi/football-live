package com.appnext.nativeads;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdRequest extends com.appnext.core.c {
    private String categories;
    private CreativeType creativeType;
    private CachingPolicy fw;
    private VideoLength fx;
    private VideoQuality fy;
    private String mSpecificCategories;
    private int maxVideoLength;
    private int minVideoLength;
    private String postback;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum CachingPolicy {
        NOTHING(0),
        STATIC_ONLY(1),
        VIDEO_ONLY(2),
        ALL(3);
        
        private int value;

        CachingPolicy(int i10) {
            this.value = i10;
        }

        public static CachingPolicy fromInt(int i10) {
            CachingPolicy[] values;
            for (CachingPolicy cachingPolicy : values()) {
                if (cachingPolicy.getValue() == i10) {
                    return cachingPolicy;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum CreativeType {
        STATIC_ONLY,
        VIDEO_ONLY,
        ALL
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoLength {
        DEFAULT(0),
        LONG(1),
        SHORT(2);
        
        private int value;

        VideoLength(int i10) {
            this.value = i10;
        }

        public static VideoLength fromInt(int i10) {
            VideoLength[] values;
            try {
                for (VideoLength videoLength : values()) {
                    if (videoLength.getValue() == i10) {
                        return videoLength;
                    }
                }
                return null;
            } catch (Throwable th) {
                com.appnext.base.a.a("NativeAdRequest$VideoLength", th);
                return null;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum VideoQuality {
        DEFAULT(0),
        HIGH(1),
        LOW(2);
        
        private int value;

        VideoQuality(int i10) {
            this.value = i10;
        }

        public static VideoQuality fromInt(int i10) {
            VideoQuality[] values;
            for (VideoQuality videoQuality : values()) {
                if (videoQuality.getValue() == i10) {
                    return videoQuality;
                }
            }
            return null;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public NativeAdRequest() {
        this.categories = "";
        this.mSpecificCategories = "";
        this.postback = "";
        this.fw = CachingPolicy.ALL;
        this.creativeType = CreativeType.ALL;
        this.fx = VideoLength.DEFAULT;
        this.fy = VideoQuality.DEFAULT;
        this.minVideoLength = 0;
        this.maxVideoLength = 0;
    }

    public CachingPolicy getCachingPolicy() {
        return this.fw;
    }

    public String getCategories() {
        return this.categories;
    }

    public CreativeType getCreativeType() {
        return this.creativeType;
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public VideoLength getVideoLength() {
        return this.fx;
    }

    public VideoQuality getVideoQuality() {
        return this.fy;
    }

    public NativeAdRequest setCachingPolicy(CachingPolicy cachingPolicy) {
        this.fw = cachingPolicy;
        return this;
    }

    public NativeAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public NativeAdRequest setCreativeType(CreativeType creativeType) {
        this.creativeType = creativeType;
        return this;
    }

    public NativeAdRequest setMaxVideoLength(int i10) {
        if (i10 >= 0) {
            if (i10 > 0 && getMinVideoLength() > 0 && i10 < getMinVideoLength()) {
                throw new IllegalArgumentException("Max Length cannot be lower than min length");
            }
            this.maxVideoLength = i10;
            return this;
        }
        throw new IllegalArgumentException("Max Length must be higher than 0");
    }

    public NativeAdRequest setMinVideoLength(int i10) {
        if (i10 >= 0 && (i10 <= 0 || getMaxVideoLength() <= 0 || i10 <= getMaxVideoLength())) {
            this.minVideoLength = i10;
        } else {
            this.minVideoLength = 0;
        }
        return this;
    }

    public NativeAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public NativeAdRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }

    public NativeAdRequest setVideoLength(VideoLength videoLength) {
        this.fx = videoLength;
        return this;
    }

    public NativeAdRequest setVideoQuality(VideoQuality videoQuality) {
        this.fy = videoQuality;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeAdRequest(NativeAdRequest nativeAdRequest) {
        this.categories = "";
        this.mSpecificCategories = "";
        this.postback = "";
        this.fw = CachingPolicy.ALL;
        this.creativeType = CreativeType.ALL;
        this.fx = VideoLength.DEFAULT;
        this.fy = VideoQuality.DEFAULT;
        this.minVideoLength = 0;
        this.maxVideoLength = 0;
        this.categories = nativeAdRequest.categories;
        this.mSpecificCategories = nativeAdRequest.mSpecificCategories;
        this.postback = nativeAdRequest.postback;
        this.fw = nativeAdRequest.fw;
        this.creativeType = nativeAdRequest.creativeType;
        this.fx = nativeAdRequest.fx;
        this.fy = nativeAdRequest.fy;
    }
}
