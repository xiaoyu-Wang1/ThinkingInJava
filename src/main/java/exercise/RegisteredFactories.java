package exercise;//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.

import net.mindview.util.TypeCounter;
import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Class<? extends  Part>> classList =
            new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        classList.add(FuelFilter.class);
        classList.add(AirFilter.class);
        classList.add(CabinAirFilter.class);
    }

    private static Random rand = new Random(47);

    public static Part createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(classList.size());
        return classList.get(n).newInstance();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements typeinfo.factory.Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements typeinfo.factory.Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        for (int i = 0; i < 10; i++)
//            System.out.println(Part.createRandom());

        TypeCounter counter = new TypeCounter(Part.class);
        for (int i = 0; i < 10; i++) {
            counter.count(Part.createRandom());
        }
        System.out.println(counter);
    }
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~
