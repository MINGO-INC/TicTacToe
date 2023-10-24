union()
{
    translate([0.0, 4.5, 0.0])
    {
        linear_extrude(height = 3.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([30.0, 1.5])
            {
                M8();
            }
        }
    }
    translate([0.0, -5.5, 0.0])
    {
        linear_extrude(height = 3.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([30.0, 1.5])
            {
                M8();
            }
        }
    }
    translate([4.5, 0.0, 0.0])
    {
        rotate([0.0, 0.0, 90.0])
        {
            linear_extrude(height = 3.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
            {
                scale([30.0, 1.5])
                {
                    M8();
                }
            }
        }
    }
    translate([-5.5, 0.0, 0.0])
    {
        rotate([0.0, 0.0, 90.0])
        {
            linear_extrude(height = 3.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
            {
                scale([30.0, 1.5])
                {
                    M8();
                }
            }
        }
    }
}

module M8()
{
    polygon
    (
        points =
        [
            [-0.5, -0.5], 
            [0.5, -0.5], 
            [0.5, 0.5], 
            [-0.5, 0.5]
        ],
        paths =
        [
            [0, 1, 2, 3]
        ]
    );
}
