package com.beastbikes.android.sphere.restful;

/**
 * The concept of the RESTful API invocation
 *
 * @author johnsonlee
 * @since 1.0.0
 */
public interface Invocation {

    /**
     * Invoke the RESTful API with the specified arguments
     * 
     * @param args
     *           The arguments that the RESTful API required.
     * @return The invocation result
     * @throws InvocationException
     */
    public Object invoke(final Object... args) throws InvocationException;

}
