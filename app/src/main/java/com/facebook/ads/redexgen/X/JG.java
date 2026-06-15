package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public interface JG {
    void A9T();

    boolean A9g();

    boolean A9h();

    boolean AAR();

    void AFz(boolean z10, int i10);

    void AJ7(int i10);

    void AJC(IP ip, int i10);

    void AJK(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    IP getStartReason();

    JI getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(JJ jj);

    void setup(Uri uri);
}
