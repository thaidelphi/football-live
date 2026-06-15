package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import s.e;
/* compiled from: Placeholder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f2209a;

    /* renamed from: b  reason: collision with root package name */
    private View f2210b;

    /* renamed from: c  reason: collision with root package name */
    private int f2211c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f2210b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2210b.getLayoutParams();
        bVar2.f2059n0.T0(0);
        e.b y10 = bVar.f2059n0.y();
        e.b bVar3 = e.b.FIXED;
        if (y10 != bVar3) {
            bVar.f2059n0.U0(bVar2.f2059n0.R());
        }
        if (bVar.f2059n0.O() != bVar3) {
            bVar.f2059n0.v0(bVar2.f2059n0.v());
        }
        bVar2.f2059n0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2209a == -1 && !isInEditMode()) {
            setVisibility(this.f2211c);
        }
        View findViewById = constraintLayout.findViewById(this.f2209a);
        this.f2210b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f2035b0 = true;
            this.f2210b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2210b;
    }

    public int getEmptyVisibility() {
        return this.f2211c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f2209a == i10) {
            return;
        }
        View view = this.f2210b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2210b.getLayoutParams()).f2035b0 = false;
            this.f2210b = null;
        }
        this.f2209a = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2211c = i10;
    }
}
