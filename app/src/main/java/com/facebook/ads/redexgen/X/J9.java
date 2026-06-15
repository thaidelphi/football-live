package com.facebook.ads.redexgen.X;

import android.widget.MediaController;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class J9 implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC1340an A00;

    public J9(TextureView$SurfaceTextureListenerC1340an textureView$SurfaceTextureListenerC1340an) {
        this.A00 = textureView$SurfaceTextureListenerC1340an;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        J3 j32;
        J3 j33;
        j32 = this.A00.A0C;
        if (j32 != null) {
            j33 = this.A00.A0C;
            return j33.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        J3 j32;
        J3 j33;
        j32 = this.A00.A0C;
        if (j32 != null) {
            j33 = this.A00.A0C;
            return j33.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        J3 j32;
        J3 j33;
        j32 = this.A00.A0C;
        if (j32 != null) {
            j33 = this.A00.A0C;
            if (j33.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        JJ jj;
        JJ jj2;
        jj = this.A00.A0F;
        if (jj == null) {
            return;
        }
        jj2 = this.A00.A0F;
        jj2.AE3();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        JJ jj;
        JJ jj2;
        jj = this.A00.A0F;
        if (jj == null) {
            return;
        }
        jj2 = this.A00.A0F;
        jj2.AE4();
    }
}
