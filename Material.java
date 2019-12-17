/* CSC 120 PA7
 * Dana Lucas
 * 11/20/19
 *
 * Project Description: This program calculates the average melting temperature and maximum Young's Modulus for 
 *                      various materials. It also lists out all materials, and then those that are alloys and
 *                      those that are metals, separately.
 *
 * Acknowledgements:
/**
 *
 * @author lucasdm2022
 */
public class Material {
    private String name, category;
    private Integer youngsModulus, tensileStrength, meltingPoint, density;
    private Double poissonsRatio;

    public Material(String n, String cat, Integer ym, Integer ts, Integer mp, Double pr, Integer d){
        name = n;
        category = cat;
        youngsModulus = ym;
        tensileStrength = ts;
        meltingPoint = mp;
        poissonsRatio = pr;
        density = d;
    }

    public String getName(){
        return name;
    } // end of getName()

    public String getCategory(){
        return category;
    } // end of getCategory()

    public Integer getYoungsModulus(){
        return youngsModulus;
    } // end of getYoungsModulus()

    public Integer getTensileStrength(){
        return tensileStrength;
    } // end of getTensileStrength()

    public Integer getMeltingPoint(){
        return meltingPoint;
    } // end of getMeltingPoint()

    public Double getPoissonsRatio(){
        return poissonsRatio;
    } // end of getPoissonsRatio()

    public Integer getDensity(){
        return density;
    } // end of getDensity()

    public String toString(){
        return(name + " " + category + 
            " has a Young's Modulus = " + youngsModulus + " GPa, " + 
            "\tultimate tensile strength = " + tensileStrength + " MPa, " +
            "\tmelting point = " + meltingPoint + "*C, " + 
            "\tPoisson's Ration = " + poissonsRatio + ", " + 
            "\tand density = " + density + " kg/m^3.");
    } // end of toString()

}
