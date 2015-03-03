package hu.bme.mit.massif.models.simulink.util;

import hu.bme.mit.massif.models.simulink.util.SimpleConnectedInPortMatch;
import hu.bme.mit.massif.models.simulink.util.util.SimpleConnectedInPortQuerySpecification;
import hu.bme.mit.massif.simulink.InPort;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.massif.models.simulink.util.simpleConnectedInPort pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SimpleConnectedInPortMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern simpleConnectedInPort(sourceInPort : InPort, targetInPort : InPort) {
 * 	find simpleInPortToInPortConnection(sourceInPort, targetInPort, _pc);
 * }
 * </pre></code>
 * 
 * @see SimpleConnectedInPortMatch
 * @see SimpleConnectedInPortProcessor
 * @see SimpleConnectedInPortQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SimpleConnectedInPortMatcher extends BaseMatcher<SimpleConnectedInPortMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SimpleConnectedInPortMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SimpleConnectedInPortMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SimpleConnectedInPortMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SOURCEINPORT = 0;
  
  private final static int POSITION_TARGETINPORT = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SimpleConnectedInPortMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public SimpleConnectedInPortMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public SimpleConnectedInPortMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @return matches represented as a SimpleConnectedInPortMatch object.
   * 
   */
  public Collection<SimpleConnectedInPortMatch> getAllMatches(final InPort pSourceInPort, final InPort pTargetInPort) {
    return rawGetAllMatches(new Object[]{pSourceInPort, pTargetInPort});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @return a match represented as a SimpleConnectedInPortMatch object, or null if no match is found.
   * 
   */
  public SimpleConnectedInPortMatch getOneArbitraryMatch(final InPort pSourceInPort, final InPort pTargetInPort) {
    return rawGetOneArbitraryMatch(new Object[]{pSourceInPort, pTargetInPort});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final InPort pSourceInPort, final InPort pTargetInPort) {
    return rawHasMatch(new Object[]{pSourceInPort, pTargetInPort});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final InPort pSourceInPort, final InPort pTargetInPort) {
    return rawCountMatches(new Object[]{pSourceInPort, pTargetInPort});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final InPort pSourceInPort, final InPort pTargetInPort, final IMatchProcessor<? super SimpleConnectedInPortMatch> processor) {
    rawForEachMatch(new Object[]{pSourceInPort, pTargetInPort}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final InPort pSourceInPort, final InPort pTargetInPort, final IMatchProcessor<? super SimpleConnectedInPortMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSourceInPort, pTargetInPort}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceInPort the fixed value of pattern parameter sourceInPort, or null if not bound.
   * @param pTargetInPort the fixed value of pattern parameter targetInPort, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SimpleConnectedInPortMatch newMatch(final InPort pSourceInPort, final InPort pTargetInPort) {
    return SimpleConnectedInPortMatch.newMatch(pSourceInPort, pTargetInPort);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<InPort> rawAccumulateAllValuesOfsourceInPort(final Object[] parameters) {
    Set<InPort> results = new HashSet<InPort>();
    rawAccumulateAllValues(POSITION_SOURCEINPORT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOfsourceInPort() {
    return rawAccumulateAllValuesOfsourceInPort(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOfsourceInPort(final SimpleConnectedInPortMatch partialMatch) {
    return rawAccumulateAllValuesOfsourceInPort(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOfsourceInPort(final InPort pTargetInPort) {
    return rawAccumulateAllValuesOfsourceInPort(new Object[]{
    null, 
    pTargetInPort
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<InPort> rawAccumulateAllValuesOftargetInPort(final Object[] parameters) {
    Set<InPort> results = new HashSet<InPort>();
    rawAccumulateAllValues(POSITION_TARGETINPORT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOftargetInPort() {
    return rawAccumulateAllValuesOftargetInPort(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOftargetInPort(final SimpleConnectedInPortMatch partialMatch) {
    return rawAccumulateAllValuesOftargetInPort(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetInPort.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<InPort> getAllValuesOftargetInPort(final InPort pSourceInPort) {
    return rawAccumulateAllValuesOftargetInPort(new Object[]{
    pSourceInPort, 
    null
    });
  }
  
  @Override
  protected SimpleConnectedInPortMatch tupleToMatch(final Tuple t) {
    try {
    	return SimpleConnectedInPortMatch.newMatch((hu.bme.mit.massif.simulink.InPort) t.get(POSITION_SOURCEINPORT), (hu.bme.mit.massif.simulink.InPort) t.get(POSITION_TARGETINPORT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SimpleConnectedInPortMatch arrayToMatch(final Object[] match) {
    try {
    	return SimpleConnectedInPortMatch.newMatch((hu.bme.mit.massif.simulink.InPort) match[POSITION_SOURCEINPORT], (hu.bme.mit.massif.simulink.InPort) match[POSITION_TARGETINPORT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SimpleConnectedInPortMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SimpleConnectedInPortMatch.newMutableMatch((hu.bme.mit.massif.simulink.InPort) match[POSITION_SOURCEINPORT], (hu.bme.mit.massif.simulink.InPort) match[POSITION_TARGETINPORT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SimpleConnectedInPortMatcher> querySpecification() throws IncQueryException {
    return SimpleConnectedInPortQuerySpecification.instance();
  }
}
