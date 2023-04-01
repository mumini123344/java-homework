package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.javaoop.figures.CircleAbstract;

public interface IResizableCircle {
    CircleAbstract returnDoubleSizedCircle(CircleAbstract circleAbstract);
    CircleAbstract returnCustomSizedCircle(CircleAbstract circleAbstract, double byvValue);
}
