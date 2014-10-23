package turilla

class Artist extends IArtist{

	String alias
    String name
    String lastName
	int rating

	static hasMany = [ activities: Activity ]

	static constraints = {
		alias nullable: true
        rating: nullable: false
    }

    public def rate(){

    }
}
