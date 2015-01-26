package pathfinder.gui;

import pathfinder.gui.dialog.column.BasicColumn;
import pathfinder.mapping.ColorMapper;

import java.awt.Color;
import java.awt.Font;

public class Resources
{
	public static final Font FONT_12 = new Font("Helvetica", Font.PLAIN, 12);
	public static final Font FONT_MONO_12 = new Font("Courier New", Font.PLAIN, 12);
	public static final Color PC_COLOR = new Color(79, 209, 226);
	public static final Color NPC_COLOR = new Color(250, 112, 112);
	public static final Color DIALOG_BACK = new Color(173, 156, 156);
	public static final Color ARROW_COLOR = Color.darkGray;
	public static final BasicColumn BORDER_5 = new BasicColumn(5);
	public static final ColorMapper BACK_COLOR_MAPPER = new ColorMapper(PC_COLOR, NPC_COLOR);

	private Resources()
	{
	}
}
