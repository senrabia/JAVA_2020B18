package Day31_BulkOperations;

public class ABulkOperations_Explain {
    public static void main(String[] args) {
        /*
Methods:
    contains(Object): returns boolean
    equals(ArrayListName): compares two arrayList
    isEmpty(): returns boolean, depeding on the size
                size == 0  ===> true
                otherwise ==> false
Bulk Operations:
        containsAll(CollectionType): verifies if all objects in CollectionType are contained in the list or not, returns boolean
        addAll(CollectionType): adds multiple objects, adds all the objects from given collection type
        removeAll(CollectionType): removes multiple objetcs, removes all the matching objects
        retainAll(CollectionType): emoves all the unmatching objects
                    {1,2,3,4,5,6,7,1,2,3,4}
                    removeAll(1,2,3,4) ==> {5,6,7}
                    retainAll(1,2,3,4) ==> {1,2,3,4,1,2,3,4 }
Arrays.asList(object1, object2 ..): returns the collection type (List)
 ArrayList<Integer> numList = new ArrayList<>(CollectionType);
sorting arrayList:
    Collections.sort(ArrayListName); ==> Ascending order
    Collections: presented in "java.util" package
        import PackGaName.Classname;
        import java.util.Collections;
Tomorrow: Predicate
          simple lambda                      */

    }
}
