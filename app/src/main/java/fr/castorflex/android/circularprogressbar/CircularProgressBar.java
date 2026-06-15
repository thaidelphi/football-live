package fr.castorflex.android.circularprogressbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import fr.castorflex.android.circularprogressbar.b;
import g8.c;
import g8.d;
import g8.e;
import g8.f;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class CircularProgressBar extends ProgressBar {
    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g8.a.f25826a);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (isInEditMode()) {
            setIndeterminateDrawable(new b.h(context, true).a());
            return;
        }
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f25833a, i10, 0);
        int color = obtainStyledAttributes.getColor(f.f25834b, resources.getColor(g8.b.f25827a));
        float dimension = obtainStyledAttributes.getDimension(f.f25839g, resources.getDimension(c.f25828a));
        float f10 = obtainStyledAttributes.getFloat(f.f25840h, Float.parseFloat(resources.getString(e.f25832b)));
        float f11 = obtainStyledAttributes.getFloat(f.f25838f, Float.parseFloat(resources.getString(e.f25831a)));
        int resourceId = obtainStyledAttributes.getResourceId(f.f25835c, 0);
        int integer = obtainStyledAttributes.getInteger(f.f25837e, resources.getInteger(d.f25830b));
        int integer2 = obtainStyledAttributes.getInteger(f.f25836d, resources.getInteger(d.f25829a));
        obtainStyledAttributes.recycle();
        int[] intArray = resourceId != 0 ? resources.getIntArray(resourceId) : null;
        b.h e8 = new b.h(context).i(f10).g(f11).h(dimension).f(integer).e(integer2);
        if (intArray != null && intArray.length > 0) {
            e8.c(intArray);
        } else {
            e8.b(color);
        }
        setIndeterminateDrawable(e8.a());
    }
}
